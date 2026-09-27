package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum bwk {
    NUMBER_OF_ROOTED_FLAGS(7),
    IS_TEST_KEYS_FOUND(0),
    IS_SU_FOUND(1),
    IS_SUPER_USER_APK_FOUND(2),
    DETECT_ROOT_MANAGEMENT_APPS(3),
    CHECK_FOR_BINARY_SU(4),
    CHECK_FOR_BINARY_BUSYBOX(5),
    CHECK_FOR_BINARY_MAGISK(6);

    private final int a;

    bwk(int i) {
        this.a = i;
    }

    public static bwk a(int i) {
        bwk bwkVar = IS_TEST_KEYS_FOUND;
        if (i == bwkVar.a) {
            return bwkVar;
        }
        bwk bwkVar2 = IS_SU_FOUND;
        if (i == bwkVar2.a) {
            return bwkVar2;
        }
        bwk bwkVar3 = IS_SUPER_USER_APK_FOUND;
        if (i == bwkVar3.a) {
            return bwkVar3;
        }
        bwk bwkVar4 = DETECT_ROOT_MANAGEMENT_APPS;
        if (i == bwkVar4.a) {
            return bwkVar4;
        }
        bwk bwkVar5 = CHECK_FOR_BINARY_SU;
        if (i == bwkVar5.a) {
            return bwkVar5;
        }
        bwk bwkVar6 = CHECK_FOR_BINARY_BUSYBOX;
        if (i == bwkVar6.a) {
            return bwkVar6;
        }
        bwk bwkVar7 = CHECK_FOR_BINARY_MAGISK;
        if (i == bwkVar7.a) {
            return bwkVar7;
        }
        return null;
    }

    public final int b() {
        return this.a;
    }
}
