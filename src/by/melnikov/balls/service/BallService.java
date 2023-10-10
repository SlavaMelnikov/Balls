package by.melnikov.balls.service;

import by.melnikov.balls.entity.Ball;
import by.melnikov.balls.entity.Color;

import java.util.List;

public interface BallService {
    double countTotalWeight(List<Ball> balls);
    int countBallsByColor(List<Ball> balls, Color color);
    List<Ball> createBalls();
}
