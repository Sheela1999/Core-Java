package com.xworkz.game;

public class GameClass {

		final String gameName = "Badminton";
		final byte noOfPlayers = 2;
		final String type = new String("Indoor");
		final String surface = "rectangular";
		final String firstPlayerName = "SainaNehwal";
		long noOfAudience = 3890765;
		int noOfGames = 40;
		char firstLetterOfGame ='B';
		static long prizeAmount = 3250000;
		boolean isThereAnyRulesForGames = true;
		static String coachName = "pullelaVimal";
		static short coachSalary = 32743;
	    float likeGames = 69.03f;
	    double doNotLikeGames = 5.3d;
	    static byte noOfMatchs = 3;
	    static String courtName = "pullela";
		NameOfTheGames gamesName;
	    NameofThePrize prizeName;
	    NameOfThePlayers playersName;
		GiveJerseyColours jerseyColours;
		NameOfTheEquipments equipmentName;
		
		
		public static void main(String[] args){
		
		    GameClass obj = new GameClass(NameOfTheGames.CHESS,NameofThePrize.GOLDMEDAL,NameOfThePlayers.PVSINDHU,GiveJerseyColours.BLUE,NameOfTheEquipments.RACKET);
			
			System.out.println(obj.gamesName.name);
			System.out.println(obj.prizeName);
			System.out.println(obj.playersName);
			System.out.println(obj.jerseyColours);
			System.out.println(obj.equipmentName);	
		}
				
		public GameClass(NameOfTheGames gamesName,NameofThePrize prizeName,NameOfThePlayers playersName,GiveJerseyColours jerseyColours,NameOfTheEquipments equipmentName){
			this.gamesName = gamesName;
			this.prizeName = prizeName;
			this.playersName = playersName;
			this.jerseyColours = jerseyColours;
			this.equipmentName = equipmentName;
		}
	}

	enum NameOfTheGames{
		CHESS("chess"),AQUATICS("aqua"),ARCHERY("arch"),ATHLETICS("athlet"),TENNIS("tennis"),BASKETBALL("basball");
		
		String name;
		
		NameOfTheGames(String name){
	    this.name = name; 	
		}
	}

	enum NameofThePrize{
		GOLDMEDAL,SILVERMEDAL,BRONZEMEDAL;
	}

	enum NameOfThePlayers{
		PVSINDHU,SAINANEHWAL,LAKSHYASEN;
	}

	enum GiveJerseyColours{
		BLUE,PINK,BLACK;
	}

	enum NameOfTheEquipments{
		SHUTTLECOCK,RACKET,BADMINTONNET;	
	}

