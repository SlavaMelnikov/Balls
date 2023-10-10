package by.melnikov.balls.service;

import by.melnikov.balls.entity.Ball;
import by.melnikov.balls.entity.Color;
import by.melnikov.balls.entity.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BallServiceImpl implements BallService {
    @Override
    public double countTotalWeight(List<Ball> balls) {
        double totalWeight = 0.0;
        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    @Override
    public int countBallsByColor(List<Ball> balls, Color color) {
        int ballsByColor = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == color) {
                ballsByColor++;
            }
        }
        return ballsByColor;
    }

    @Override
    public List<Ball> createBalls() {
        Random random = new Random();
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double weight = 200 + random.nextDouble(300.0);                     // from 200 to 500 g
            double radius = 100 + random.nextDouble(100.0);                     // from 100 to 200 mm
            Color  color  = Color.values()[random.nextInt(Color.values().length)];
            Type   type   = Type.values()[random.nextInt(Type.values().length)];
            balls.add(new Ball(Math.ceil(weight), Math.ceil(radius), color, type));
        }
        return balls;
    }
}
