package com.blog.posts;

/**
 * @author Vinod Kumar Nair
 */
public class SwitchExpression {

    public static void main(String[] args) {
        int animalCode = getAnimalCodeUsingSwitchExpression(Animal.DOG);
        System.out.println("Animal Code: "+animalCode);

        animalCode = getAnimalCode(Animal.DOG);
        System.out.println("Animal Code: "+animalCode);
    }

    /**
     * Using new Java 12 - Switch Expression
     * @param animal
     * @return
     */
    private static int getAnimalCodeUsingSwitchExpression(Animal animal){
        return switch(animal){
            case DOG -> 10;
            case ELEPHANT -> 20;
/*            case TIGER -> 30;
            case ZEBRA -> 30;*/
            case TIGER, ZEBRA -> 30;
            case CAT -> 40;
        };
    }

    /**
     * Using old switch statement
     * @param animal
     * @return
     */
    private static int getAnimalCode(Animal animal){
        int animalCode;
        switch(animal){
            case DOG:
                animalCode = 10;
                break;

            case ELEPHANT:
                animalCode = 20;
                break;

            case TIGER:
                animalCode = 30;
                break;

            case ZEBRA:
                animalCode = 30;
                break;

            case CAT:
                animalCode = 40;
                break;

            default:
                animalCode = 0;
        }
        return animalCode;
    }

    enum Animal{
        ELEPHANT,
        TIGER,
        ZEBRA,
        DOG,
        CAT
    }
}