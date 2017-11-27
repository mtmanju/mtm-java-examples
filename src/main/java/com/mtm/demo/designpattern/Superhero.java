package com.mtm.demo.designpattern;

//Abstract Factory Design Pattern
public class Superhero {

	class Superman extends Superhero {
	}

	class Batman extends Superhero {
	}

	class GreenLantern extends Superhero {
	}

	class Thor extends Superhero {
	}

	class Ironman extends Superhero {
	}

	class Hulk extends Superhero {
	}

	interface SuperHeroFactory {
		public Superhero getSuperhero(String power);
	}

	class JusticeLeagueFactory implements SuperHeroFactory {

		@Override
		public Superhero getSuperhero(String power) {
			if ("SUPER_STRENGTH".equalsIgnoreCase(power)) {
				return new Superman();
			} else if ("BAT_MOBILE".equalsIgnoreCase(power)) {
				return new Batman();
			} else if ("POWER_RING".equalsIgnoreCase(power)) {
				return new GreenLantern();
			}
			return new Superhero();
		}
	}

	class AvengersFactory implements SuperHeroFactory {

		@Override
		public Superhero getSuperhero(String power) {
			if ("COOL_WEAPONS".equalsIgnoreCase(power)) {
				return new Ironman();
			} else if ("THUNDER_GOD".equalsIgnoreCase(power)) {
				return new Thor();
			} else if ("HULK_SMASH".equalsIgnoreCase(power)) {
				return new Hulk();
			}
			return new Superhero();
		}
	}

	class SuperHeroAbstarctFactory {
		public SuperHeroFactory getSuperheroFactory(String team) {
			if ("AVENGERS".equalsIgnoreCase(team)) {
				return new AvengersFactory();
			} else if ("JusticeLeague".equalsIgnoreCase(team)) {
				return new JusticeLeagueFactory();
			}
			return null;
		}
	}

}
