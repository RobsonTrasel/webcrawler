package com.robsonf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    private Queue<String> queue;
    private List<String> discoveredWebsiteList;

    public BFS() {
        this.queue = new LinkedList<>();
        this.discoveredWebsiteList = new ArrayList<>();
    }
}
