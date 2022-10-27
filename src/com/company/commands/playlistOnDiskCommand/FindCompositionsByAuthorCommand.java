package com.company.commands.playlistOnDiskCommand;

import com.company.model.PlaylistOnDisk;

public class FindCompositionsByAuthorCommand implements Command{

    PlaylistOnDisk playlistOnDisk;

    public FindCompositionsByAuthorCommand(PlaylistOnDisk playlistOnDisk) {
        this.playlistOnDisk = playlistOnDisk;
    }

    @Override
    public void execute() {
        playlistOnDisk.findCompositionsByAuthor();
    }
}
