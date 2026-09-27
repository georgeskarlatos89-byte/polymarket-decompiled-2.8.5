package com.google.mlkit.vision.common.internal;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
import defpackage.bk4;
import defpackage.ck4;
import defpackage.drn;
import defpackage.pl6;
import defpackage.uk4;
import defpackage.xif;
import defpackage.yk4;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        bk4 b = ck4.b(MultiFlavorDetectorCreator.class);
        b.a(new pl6(MultiFlavorDetectorCreator.Registration.class, 2, 0));
        zzf zzfVar = new yk4() { // from class: com.google.mlkit.vision.common.internal.zzf
            @Override // defpackage.yk4
            public final Object create(uk4 uk4Var) {
                return new MultiFlavorDetectorCreator(uk4Var.g(xif.a(MultiFlavorDetectorCreator.Registration.class)));
            }
        };
        drn.a(zzfVar, "Null factory");
        b.f = zzfVar;
        return zzp.zzi(b.b());
    }
}
