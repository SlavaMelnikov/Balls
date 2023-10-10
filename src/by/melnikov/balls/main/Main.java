package by.melnikov.balls.main;

import by.melnikov.balls.entity.Ball;
import by.melnikov.balls.entity.Color;
import by.melnikov.balls.service.BallService;
import by.melnikov.balls.service.BallServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BallService ballService = new BallServiceImpl();

        List<Ball> balls = ballService.createBalls();
        double totalWeight = ballService.countTotalWeight(balls);
        int ballByColor = ballService.countBallsByColor(balls, Color.BLUE);


        // для проверки
        for (Ball ball : balls) {
            System.out.println(ball);
        }
        System.out.println("Total weight of balls = " + totalWeight);
        System.out.println("Number of balls of a certain color = " + ballByColor);
    }
}
