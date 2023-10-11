package by.melnikov.balls.main;

import by.melnikov.balls.entity.Ball;
import by.melnikov.balls.entity.Color;
import by.melnikov.balls.service.BallService;
import by.melnikov.balls.service.BallServiceImpl;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BallService ballService = new BallServiceImpl();

        List<Ball> balls = ballService.createBalls();
        double totalWeight = ballService.countTotalWeight(balls);

        Random random = new Random();
        int randomColor = random.nextInt(Color.values().length);
        int numberOfBallsByColor = ballService.countBallsByColor(balls, Color.values()[randomColor]);

        for (Ball ball : balls) {
            System.out.println(ball);
        }
        System.out.println();
        System.out.println("Total weight of balls = " + totalWeight);
        System.out.println("Number of " + Color.values()[randomColor] + " balls = " + numberOfBallsByColor);
    }
}
