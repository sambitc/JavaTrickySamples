package com.sam.enumTest;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public enum Planet {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);
	

	private final double mass; // in kilograms
	private final double radius; // in meters

	
	 Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}

	private double mass() {
		return mass;
	}

	private double radius() {
		return radius;
	}

	// universal gravitational constant (m3 kg-1 s-2)
	public static final double G = 6.67300E-11;

	double surfaceGravity() {
		return G * mass / (radius * radius);
	}

	double surfaceWeight(double otherMass) {
		return otherMass * surfaceGravity();
	}

	public static void main(String[] args) {
//		if (args.length != 1) {
//			System.err.println("Usage: java Planet <earth_weight>");
//			System.exit(-1);
//		}
		double earthWeight = 5d;
		double mass = earthWeight / EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
		
		
		Map<Planet, String> pm = new TreeMap<>();
		pm.put(Planet.JUPITER, "");
		pm.put(Planet.EARTH, "");
		pm.put(Planet.MERCURY, "");
		pm.put(Planet.NEPTUNE, "");
		pm.put(Planet.URANUS, "");
		pm.put(Planet.JUPITER, "");
		
		for (Map.Entry<Planet, String> pnt : pm.entrySet()) {
			System.out.println("------"+pnt.getKey());
			
		}
		
		List<Planet> list = new ArrayList<>();
		list.add(Planet.EARTH);
		list.add(Planet.MERCURY);
		list.add(Planet.NEPTUNE);
		
		Collections.sort(list);
		
		for (Planet planet : list) {
			System.out.println(planet);
		}
	}
	
}