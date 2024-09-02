package net.witchkings.knightsofterrafirma.misc;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;

import java.io.IOException;
import java.nio.file.Path;

import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forgespi.locating.IModFile;
import net.minecraftforge.resource.PathPackResources;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import org.jetbrains.annotations.NotNull;

public class RPLoader {
    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(RPLoader::onPackFinder);
    }

    public static void onPackFinder(AddPackFindersEvent event)
    {
        try
        {
            if (event.getPackType() == PackType.CLIENT_RESOURCES)
            {
                final IModFile modFile = ModList.get().getModFileById(KnightsOfTerraFirma.MODID).getFile();
                final Path resourcePath = modFile.getFilePath();
                try (PathPackResources pack = new PathPackResources(modFile.getFileName() + ":overload", true, resourcePath){

                    private final IModFile file = ModList.get().getModFileById(KnightsOfTerraFirma.MODID).getFile();

                    @NotNull
                    @Override
                    protected Path resolve(String @NotNull ... paths)
                    {
                        return file.findResource(paths);
                    }
                })
                {
                    final PackMetadataSection metadata = pack.getMetadataSection(PackMetadataSection.TYPE);
                    if (metadata != null)
                    {
//                        KnightsOfTerraFirma.LOGGER.info("Injecting firmalife override pack");
                        event.addRepositorySource(consumer ->
                                consumer.accept(Pack.readMetaAndCreate("kotf_data", Component.literal("KOTF Resources"), true, id -> pack, PackType.CLIENT_RESOURCES, Pack.Position.TOP, PackSource.BUILT_IN))
                        );
                    }
                }

            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

}
