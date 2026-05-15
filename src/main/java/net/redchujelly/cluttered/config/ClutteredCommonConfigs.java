package net.redchujelly.cluttered.config;

public class ClutteredCommonConfigs {
    public static final BooleanValue REPLACE_OLD_CLUTTERED_FURNITURE = new BooleanValue(true);

    public record BooleanValue(boolean value) {
        public boolean get() {
            return value;
        }
    }
}
