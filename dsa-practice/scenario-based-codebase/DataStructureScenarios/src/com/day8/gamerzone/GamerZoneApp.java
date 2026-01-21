/*
 8. GamerZone – High Score Ranking System (Quick Sort)
Story: 
	● A global multiplayer game needs to rank thousands of players in real-time based on their
	  scores after every match. The list is dynamic, large, and often unsorted. 
	● Quick Sort is used to reorder players quickly for leaderboards.
Concepts Involved:
	● Quick Sort
	● Sorting dynamic, large datasets
	● Performance-driven solution
*/
package com.day8.gamerzone;

public class GamerZoneApp {
	public static void main(String[] args) {
		LeaderboardManager manager = new LeaderboardManager();

		// Added example players after some matches (unsorted)
		Player[] leaderboard = {
			    new Player("CyberWolf", 22150, "Asia"),
			    new Player("NightFalcon", 17420, "Europe"),
			    new Player("NovaStrike", 28900, "North America"),
			    new Player("IronClutch", 19870, "Asia"),
			    new Player("FrostByte", 16240, "Europe"),
			    new Player("AlphaRogue", 30560, "North America"),
			    new Player("ShadowPulse", 18390, "South America"),
			    new Player("VortexKing", 26780, "Asia"),
			    new Player("PhantomX", 21040, "Europe"),
			    new Player("InfernoMax", 29410, "North America")
			};

		System.out.println("Before sorting (unsorted scores):");
		manager.showTopPlayers(leaderboard, 10);
		System.out.println();

		// Sort using Quick Sort
		manager.sortLeaderboard(leaderboard);

		System.out.println("After Quick Sort - Global Leaderboard (Top 10):");
		manager.showTopPlayers(leaderboard, 10);

		System.out.println("\nTotal players ranked: " + leaderboard.length);
	}
}