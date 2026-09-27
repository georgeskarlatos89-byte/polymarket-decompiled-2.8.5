package io.sentry.android.core;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum b1 {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    b1(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
