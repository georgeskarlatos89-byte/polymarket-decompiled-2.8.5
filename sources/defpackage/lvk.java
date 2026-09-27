package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum lvk {
    ANDROID_SDK_BUILD_FOR_X86("Android SDK built for x86"),
    ANDROID_X86("android_x86"),
    ANDY("andy"),
    ANDY_OS("AndyOS"),
    ANDY_OSX("AndyOSX"),
    DRIOD_4X("Driod4X"),
    DROID_4X("Droid4X"),
    GENERIC("generic"),
    GENERIC_X86("generic_x86"),
    GENY_MOTION("Genymotion"),
    GOLDFISH("goldfish"),
    GOODLE_SDK("google_sdk"),
    SDK("sdk"),
    UNKNOWN("unknown"),
    VBOX_86("vbox86"),
    VBOX_86P("vbox86p"),
    RANCHU("ranchu"),
    REMIXEMU("remixemu"),
    TTVM_X86("ttVM_x86");

    private final String a;

    lvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
