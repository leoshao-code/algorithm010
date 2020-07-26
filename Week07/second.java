
//题目： 最小基因变化

public static void main(String[] args) {
        DFS brute = new DFS();
        brute.minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"});
        }

        int count = Integer.MAX_VALUE;

public int minMutation(String start, String end, String[] bank) {
        HashSet<String> vistied = new HashSet<>();
        dfs(0, start, end, bank, vistied);
        return count == Integer.MAX_VALUE ? -1 : count;
        }

private void dfs(int minStepCount, String start, String end, String[] bank, HashSet<String> vistied) {
        if (start.equals(end)) {
        count = Math.min(count, minStepCount);
        return;
        }
        for (int i = 0; i < bank.length; i++) {
        int diff = 0;
        for (int j = 0; j < 8; j++) {
        if (bank[i].charAt(j) != start.charAt(j)) diff++;
        if (diff > 1) break;
        }
        if (diff == 1 && !vistied.contains(bank[i])) {
        vistied.add(bank[i]);
        dfs(minStepCount + 1, bank[i], end, bank, vistied);
        vistied.remove(bank[i]);
        }
        }
        }
