package by.melnikov.balls.entity;

import java.util.StringJoiner;

public class Ball {
    private double weight;
    private double radius;
    private Color color;
    private Type type;

    public Ball(double weight, double radius, Color color, Type type) {
        setWeight(weight);
        setRadius(radius);
        setColor(color);
        setType(type);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 200.0 && weight <= 500.0) {
            this.weight = weight;
        } else {
            this.weight = 200.0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 100.0 && radius <= 200.0) {
            this.radius = radius;
        } else {
            this.radius = 100.0;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color != null) {
            this.color = color;
        } else {
            this.color = Color.WHITE;
        }
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (type != null) {
            this.type = type;
        } else {
            this.type = Type.FOOTBALL;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (Double.compare(ball.weight, weight) != 0) return false;
        if (Double.compare(ball.radius, radius) != 0) return false;
        if (color != ball.color) return false;
        return type == ball.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ball.class.getSimpleName() + "[", "]")
                .add("weight=" + weight)
                .add("radius=" + radius)
                .add("color=" + color)
                .add("type=" + type)
                .toString();
    }
}
