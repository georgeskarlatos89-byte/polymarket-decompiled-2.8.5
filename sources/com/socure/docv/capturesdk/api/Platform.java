package com.socure.docv.capturesdk.api;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/api/Platform;", "", "platformName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPlatformName", "()Ljava/lang/String;", "NATIVE", "REACT_NATIVE", "FLUTTER", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Platform {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Platform[] $VALUES;
    private final String platformName;
    public static final Platform NATIVE = new Platform("NATIVE", 0, "native");
    public static final Platform REACT_NATIVE = new Platform("REACT_NATIVE", 1, "react_native");
    public static final Platform FLUTTER = new Platform("FLUTTER", 2, "flutter");

    private static final /* synthetic */ Platform[] $values() {
        return new Platform[]{NATIVE, REACT_NATIVE, FLUTTER};
    }

    static {
        Platform[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private Platform(String str, int i, String str2) {
        this.platformName = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }

    public final String getPlatformName() {
        return this.platformName;
    }
}
