package io.intercom.android.sdk.m5.navigation.transitions;

import defpackage.gg7;
import defpackage.odn;
import defpackage.ug7;
import defpackage.ww4;
import defpackage.zf7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Lgg7;", "transition", "()Lgg7;", "SLIDE_UP", "SLIDE_IN_LEFT", "SLIDE_IN_RIGHT", "NONE", "NULL", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EnterTransitionStyle {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EnterTransitionStyle[] $VALUES;
    public static final EnterTransitionStyle SLIDE_UP = new SLIDE_UP("SLIDE_UP", 0);
    public static final EnterTransitionStyle SLIDE_IN_LEFT = new SLIDE_IN_LEFT("SLIDE_IN_LEFT", 1);
    public static final EnterTransitionStyle SLIDE_IN_RIGHT = new SLIDE_IN_RIGHT("SLIDE_IN_RIGHT", 2);
    public static final EnterTransitionStyle NONE = new EnterTransitionStyle("NONE", 3) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NONE
        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public gg7 transition() {
            return gg7.a;
        }
    };
    public static final EnterTransitionStyle NULL = new EnterTransitionStyle("NULL", 4) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NULL
        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public gg7 transition() {
            return null;
        }
    };

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_IN_RIGHT", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "Lgg7;", "transition", "()Lgg7;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SLIDE_IN_RIGHT extends EnterTransitionStyle {
        public SLIDE_IN_RIGHT(String str, int i) {
            super(str, i, null);
        }

        public static /* synthetic */ int a(int i) {
            return transition$lambda$0(i);
        }

        private static final int transition$lambda$0(int i) {
            return -i;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public gg7 transition() {
            return zf7.o(odn.f(0, 0, null, 7), new a(1));
        }
    }

    private static final /* synthetic */ EnterTransitionStyle[] $values() {
        return new EnterTransitionStyle[]{SLIDE_UP, SLIDE_IN_LEFT, SLIDE_IN_RIGHT, NONE, NULL};
    }

    static {
        EnterTransitionStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    public /* synthetic */ EnterTransitionStyle(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static EnterTransitionStyle valueOf(String str) {
        return (EnterTransitionStyle) Enum.valueOf(EnterTransitionStyle.class, str);
    }

    public static EnterTransitionStyle[] values() {
        return (EnterTransitionStyle[]) $VALUES.clone();
    }

    public abstract gg7 transition();

    private EnterTransitionStyle(String str, int i) {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_IN_LEFT", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "Lgg7;", "transition", "()Lgg7;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SLIDE_IN_LEFT extends EnterTransitionStyle {
        public SLIDE_IN_LEFT(String str, int i) {
            super(str, i, null);
        }

        public static /* synthetic */ int a(int i) {
            return transition$lambda$0(i);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public gg7 transition() {
            return zf7.o(odn.f(0, 0, null, 7), new a(0));
        }

        private static final int transition$lambda$0(int i) {
            return i;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_UP", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "Lgg7;", "transition", "()Lgg7;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SLIDE_UP extends EnterTransitionStyle {
        public SLIDE_UP(String str, int i) {
            super(str, i, null);
        }

        public static /* synthetic */ int a(int i) {
            return transition$lambda$0(i);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public gg7 transition() {
            return zf7.q(odn.f(0, 0, null, 7), new a(2));
        }

        private static final int transition$lambda$0(int i) {
            return i;
        }
    }
}
