package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class MenuService {
    public abstract void traiter(Recensement recensement, Scanner scanner);

}