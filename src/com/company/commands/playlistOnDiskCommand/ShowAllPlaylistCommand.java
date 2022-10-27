package com.company.commands.playlistOnDiskCommand;

import com.company.model.PlaylistOnDisk;

public class ShowAllPlaylistCommand implements Command{
    PlaylistOnDisk playlistOnDisk;

    public ShowAllPlaylistCommand(PlaylistOnDisk playlistOnDisk) {
        this.playlistOnDisk = playlistOnDisk;
    }

    @Override
    public void execute() {
        playlistOnDisk.showAllPlaylist();
    }
}
