package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tn1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tn1[] $VALUES;
    public static final tn1 BASE_CARD_VIEW;
    public static final tn1 IN_APP_MESSAGE_MODAL;
    public static final tn1 IN_APP_MESSAGE_SLIDEUP;
    public static final tn1 NOTIFICATION_EXPANDED_IMAGE;
    public static final tn1 NOTIFICATION_INLINE_PUSH_IMAGE;
    public static final tn1 NOTIFICATION_LARGE_ICON;
    public static final tn1 NOTIFICATION_ONE_IMAGE_STORY;
    public static final tn1 NO_BOUNDS;
    private final int heightDp;
    private final int widthDp;

    static {
        tn1 tn1Var = new tn1("NOTIFICATION_EXPANDED_IMAGE", 0, 478, 256);
        NOTIFICATION_EXPANDED_IMAGE = tn1Var;
        tn1 tn1Var2 = new tn1("NOTIFICATION_INLINE_PUSH_IMAGE", 1, 384, 256);
        NOTIFICATION_INLINE_PUSH_IMAGE = tn1Var2;
        tn1 tn1Var3 = new tn1("NOTIFICATION_LARGE_ICON", 2, 64, 64);
        NOTIFICATION_LARGE_ICON = tn1Var3;
        tn1 tn1Var4 = new tn1("NOTIFICATION_ONE_IMAGE_STORY", 3, 256, 128);
        NOTIFICATION_ONE_IMAGE_STORY = tn1Var4;
        tn1 tn1Var5 = new tn1("BASE_CARD_VIEW", 4, Barcode.FORMAT_UPC_A, Barcode.FORMAT_UPC_A);
        BASE_CARD_VIEW = tn1Var5;
        tn1 tn1Var6 = new tn1("IN_APP_MESSAGE_MODAL", 5, 580, 580);
        IN_APP_MESSAGE_MODAL = tn1Var6;
        tn1 tn1Var7 = new tn1("IN_APP_MESSAGE_SLIDEUP", 6, 100, 100);
        IN_APP_MESSAGE_SLIDEUP = tn1Var7;
        tn1 tn1Var8 = new tn1("NO_BOUNDS", 7, 0, 0);
        NO_BOUNDS = tn1Var8;
        tn1[] tn1VarArr = {tn1Var, tn1Var2, tn1Var3, tn1Var4, tn1Var5, tn1Var6, tn1Var7, tn1Var8};
        $VALUES = tn1VarArr;
        $ENTRIES = new wg7(tn1VarArr);
    }

    public tn1(String str, int i, int i2, int i3) {
        this.widthDp = i2;
        this.heightDp = i3;
    }

    public static tn1 valueOf(String str) {
        return (tn1) Enum.valueOf(tn1.class, str);
    }

    public static tn1[] values() {
        return (tn1[]) $VALUES.clone();
    }

    public final int a() {
        return this.heightDp;
    }

    public final int b() {
        return this.widthDp;
    }
}
