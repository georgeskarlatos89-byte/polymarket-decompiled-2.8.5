package io.intercom.android.sdk.m5.home.states;

import defpackage.sv6;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "", "None", "IconWithIndicator", "IndicatorWithCount", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$IconWithIndicator;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$IndicatorWithCount;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$None;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HomeItemBadge {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$IconWithIndicator;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class IconWithIndicator implements HomeItemBadge {
        public static final int $stable = 0;
        public static final IconWithIndicator INSTANCE = new IconWithIndicator();

        private IconWithIndicator() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$IndicatorWithCount;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class IndicatorWithCount implements HomeItemBadge {
        public static final int $stable = 0;
        private final int count;

        public IndicatorWithCount(int i) {
            this.count = i;
        }

        public static /* synthetic */ IndicatorWithCount copy$default(IndicatorWithCount indicatorWithCount, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = indicatorWithCount.count;
            }
            return indicatorWithCount.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final IndicatorWithCount copy(int count) {
            return new IndicatorWithCount(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof IndicatorWithCount) && this.count == ((IndicatorWithCount) other).count) {
                return true;
            }
            return false;
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return Integer.hashCode(this.count);
        }

        public String toString() {
            return sv6.o(new StringBuilder("IndicatorWithCount(count="), this.count, ')');
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeItemBadge$None;", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class None implements HomeItemBadge {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }
    }
}
