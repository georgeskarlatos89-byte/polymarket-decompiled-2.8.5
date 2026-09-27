package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zre {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zre[] $VALUES;
    public static final zre Cordova;
    public static final zre Flutter;
    public static final zre ReactNative;
    public static final zre Unity;
    private final String className;
    private final String pluginName;

    static {
        zre zreVar = new zre("ReactNative", 0, "com.facebook.react.bridge.NativeModule", "react-native");
        ReactNative = zreVar;
        zre zreVar2 = new zre("Flutter", 1, "io.flutter.embedding.engine.FlutterEngine", "flutter");
        Flutter = zreVar2;
        zre zreVar3 = new zre("Cordova", 2, "org.apache.cordova.CordovaActivity", "cordova");
        Cordova = zreVar3;
        zre zreVar4 = new zre("Unity", 3, "com.unity3d.player.UnityPlayerActivity", "unity");
        Unity = zreVar4;
        zre[] zreVarArr = {zreVar, zreVar2, zreVar3, zreVar4};
        $VALUES = zreVarArr;
        $ENTRIES = new wg7(zreVarArr);
    }

    public zre(String str, int i, String str2, String str3) {
        this.className = str2;
        this.pluginName = str3;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static zre valueOf(String str) {
        return (zre) Enum.valueOf(zre.class, str);
    }

    public static zre[] values() {
        return (zre[]) $VALUES.clone();
    }

    public final String a() {
        return this.className;
    }

    public final String c() {
        return this.pluginName;
    }
}
