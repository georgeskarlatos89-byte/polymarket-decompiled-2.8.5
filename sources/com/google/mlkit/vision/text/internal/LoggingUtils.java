package com.google.mlkit.vision.text.internal;

import defpackage.awn;
import defpackage.den;
import defpackage.gpn;
import defpackage.jen;
import defpackage.oen;
import defpackage.sen;
import defpackage.vt1;
import defpackage.xvn;
import defpackage.zpn;
import defpackage.zun;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class LoggingUtils {
    private LoggingUtils() {
    }

    public static zpn zza(int i) {
        switch (i) {
            case 1:
                return zpn.LATIN;
            case 2:
                return zpn.LATIN_AND_CHINESE;
            case 3:
                return zpn.LATIN_AND_DEVANAGARI;
            case 4:
                return zpn.LATIN_AND_JAPANESE;
            case 5:
                return zpn.LATIN_AND_KOREAN;
            case 6:
                return zpn.CREDIT_CARD;
            case 7:
                return zpn.DOCUMENT;
            case 8:
                return zpn.PIXEL_AI;
            default:
                return zpn.TYPE_UNKNOWN;
        }
    }

    public static void zzb(awn awnVar, final boolean z, final jen jenVar) {
        awnVar.b(new xvn() { // from class: com.google.mlkit.vision.text.internal.zzl
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sen] */
            /* JADX WARN: Type inference failed for: r1v3, types: [zon, java.lang.Object] */
            @Override // defpackage.xvn
            public final zun zza() {
                den denVar;
                ?? obj = new Object();
                if (z) {
                    denVar = den.TYPE_THICK;
                } else {
                    denVar = den.TYPE_THIN;
                }
                jen jenVar2 = jenVar;
                obj.c = denVar;
                ?? obj2 = new Object();
                obj2.a = jenVar2;
                obj.e = new gpn(obj2);
                return new vt1((sen) obj, 0);
            }
        }, oen.ON_DEVICE_TEXT_LOAD);
    }
}
