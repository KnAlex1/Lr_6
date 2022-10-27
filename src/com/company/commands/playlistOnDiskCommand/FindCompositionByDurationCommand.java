package com.company.commands.playlistOnDiskCommand;

import com.company.model.PlaylistOnDisk;

import static com.company.menu.MenuUtils.in;

public class FindCompositionByDurationCommand implements Command{

    PlaylistOnDisk playlistOnDisk;

    public FindCompositionByDurationCommand(PlaylistOnDisk playlistOnDisk) {
        this.playlistOnDisk = playlistOnDisk;
    }

    @Override
    public void execute() {

        playlistOnDisk.findCompositionByDuration();
    }
}
