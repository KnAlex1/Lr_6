package com.company.commands.playlistOnDiskCommand;

import com.company.model.PlaylistOnDisk;

public class CountDurationOfPlaylistCommand implements Command{
    PlaylistOnDisk playlistOnDisk;

    public CountDurationOfPlaylistCommand(PlaylistOnDisk playlistOnDisk) {
        this.playlistOnDisk = playlistOnDisk;
    }

    @Override
    public void execute() {
        playlistOnDisk.countDurationOfPlaylist();
    }
}
