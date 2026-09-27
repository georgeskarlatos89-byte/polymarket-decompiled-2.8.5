package com.google.mlkit.vision.common.internal;

import com.google.mlkit.common.sdkinternal.MlKitContext;
import defpackage.arn;
import defpackage.lgf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class MultiFlavorDetectorCreator {
    private final Map zza = new HashMap();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public interface DetectorCreator<DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> {
        DetectorT create(OptionsT optionst);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public interface DetectorOptions<DetectorT> {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public interface MultiFlavorDetector {
    }

    public MultiFlavorDetectorCreator(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Registration registration = (Registration) it.next();
            Class zzc = registration.zzc();
            if (this.zza.containsKey(zzc)) {
                int zza = registration.zza();
                Integer num = (Integer) hashMap.get(zzc);
                arn.h(num);
                if (zza >= num.intValue()) {
                }
            }
            this.zza.put(zzc, registration.zzb());
            hashMap.put(zzc, Integer.valueOf(registration.zza()));
        }
    }

    public static synchronized MultiFlavorDetectorCreator getInstance() {
        MultiFlavorDetectorCreator multiFlavorDetectorCreator;
        synchronized (MultiFlavorDetectorCreator.class) {
            multiFlavorDetectorCreator = (MultiFlavorDetectorCreator) MlKitContext.getInstance().get(MultiFlavorDetectorCreator.class);
        }
        return multiFlavorDetectorCreator;
    }

    public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> DetectorT create(OptionsT optionst) {
        lgf lgfVar = (lgf) this.zza.get(optionst.getClass());
        arn.h(lgfVar);
        return (DetectorT) ((DetectorCreator) lgfVar.get()).create(optionst);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Registration {
        private final Class zza;
        private final lgf zzb;
        private final int zzc;

        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(Class<? extends OptionsT> cls, lgf lgfVar, int i) {
            this.zza = cls;
            this.zzb = lgfVar;
            this.zzc = i;
        }

        public final int zza() {
            return this.zzc;
        }

        public final lgf zzb() {
            return this.zzb;
        }

        public final Class zzc() {
            return this.zza;
        }

        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(Class<? extends OptionsT> cls, lgf lgfVar) {
            this(cls, lgfVar, 100);
        }
    }
}
