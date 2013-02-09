package com.gmail.nossr50.party;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import com.gmail.nossr50.mcMMO;

public class Party {
    private List<String> members = new ArrayList<String>();
    private String leader;
    private String name;
    private String password;
    private boolean locked;
    private ShareHandler.ShareMode xpShareMode;
    private ShareHandler.ShareMode itemShareMode;

    public List<String> getMembers() {
        return members;
    }

    public List<Player> getOnlineMembers() {
        Player[] onlinePlayers = mcMMO.p.getServer().getOnlinePlayers();
        List<Player> onlineMembers = new ArrayList<Player>();

        for (Player onlinePlayer : onlinePlayers) {
            if (members.contains(onlinePlayer.getName())) {
                onlineMembers.add(onlinePlayer);
            }
        }

        return onlineMembers;
    }

    public String getLeader() {
        return leader;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void setXpShareMode(ShareHandler.ShareMode xpShareMode) {
        this.xpShareMode = xpShareMode;
    }

    public ShareHandler.ShareMode getXpShareMode() {
        return xpShareMode;
    }

    public void setItemShareMode(ShareHandler.ShareMode itemShareMode) {
        this.itemShareMode = itemShareMode;
    }

    public ShareHandler.ShareMode getItemShareMode() {
        return itemShareMode;
    }
}
