package com.epicness.endurtawer.game.constants;

import static com.epicness.fundamentals.SharedConstants.CAMERA_HEIGHT;
import static com.epicness.fundamentals.SharedConstants.CAMERA_WIDTH;

import com.badlogic.gdx.math.Vector2;

public class GameConstants {

    public static final float ACCELERATION = 10f;

    private static final float PLAYER_RATIO = 350f / 600f;
    public static final float PLAYER_WIDTH = 100f;
    public static final float PLAYER_HEIGHT = PLAYER_WIDTH * PLAYER_RATIO;
    public static final float MAX_PLAYER_X = CAMERA_WIDTH - PLAYER_WIDTH;
    public static final float MAX_PLAYER_Y = CAMERA_HEIGHT - PLAYER_HEIGHT;
    public static final Vector2 STARTING_PLAYER_POSITION = new Vector2(PLAYER_WIDTH / 2f, CAMERA_HEIGHT / 2f);

    public static final float STOP_TIME = 1.5f;
    public static final int GOOD_TENTACLE_SEGMENTS = 20;
    public static final int EVIL_TENTACLE_SEGMENTS = 10;
    public static final float GOOD_SEGMENT_LENGTH = 15f;
    public static final float EVIL_SEGMENT_LENGTH = 35f;
    public static final float TENTACLE_START_WIDTH = 5f;
    public static final float TENTACLE_END_WIDTH = 20f;
    public static final float TENTACLE_LIGHT_DIAMETER = 20f;
}