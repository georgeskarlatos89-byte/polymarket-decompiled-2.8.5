package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class aq9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ aq9[] $VALUES;
    public static final zp9 Companion;
    public static final aq9 JPEG;
    public static final aq9 PNG;
    public static final aq9 WEBP;
    private final Bitmap.CompressFormat compressFormat;
    private final List<String> suffixes;

    /* JADX WARN: Type inference failed for: r0v2, types: [zp9, java.lang.Object] */
    static {
        aq9 aq9Var = new aq9("PNG", 0, eb4.c("png"), Bitmap.CompressFormat.PNG);
        PNG = aq9Var;
        aq9 aq9Var2 = new aq9("WEBP", 1, eb4.c("webp"), Bitmap.CompressFormat.WEBP);
        WEBP = aq9Var2;
        aq9 aq9Var3 = new aq9("JPEG", 2, CollectionsKt.listOf("jpeg", "jpg"), Bitmap.CompressFormat.JPEG);
        JPEG = aq9Var3;
        aq9[] aq9VarArr = {aq9Var, aq9Var2, aq9Var3};
        $VALUES = aq9VarArr;
        $ENTRIES = new wg7(aq9VarArr);
        Companion = new Object();
    }

    public aq9(String str, int i, List list, Bitmap.CompressFormat compressFormat) {
        this.suffixes = list;
        this.compressFormat = compressFormat;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static aq9 valueOf(String str) {
        return (aq9) Enum.valueOf(aq9.class, str);
    }

    public static aq9[] values() {
        return (aq9[]) $VALUES.clone();
    }

    public final List b() {
        return this.suffixes;
    }
}
