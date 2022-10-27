package com.company.commands.playlistOnDiskCommand;

import com.company.model.PlaylistOnDisk;

import java.util.Scanner;

import static com.company.menu.MenuUtils.in;

public class FindCompositionByTitleCommand implements Command{


    PlaylistOnDisk playlistOnDisk;

    public FindCompositionByTitleCommand(PlaylistOnDisk playlistOnDisk) {
        this.playlistOnDisk = playlistOnDisk;
    }

    @Override
    public void execute() {
        playlistOnDisk.findCompositionByTitle();
    }
}
