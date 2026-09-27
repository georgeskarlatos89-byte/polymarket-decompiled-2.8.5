package com.google.mlkit.vision.mediapipe.pose;

import defpackage.jzl;
import defpackage.zyl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class PoseHolder {
    private final List zza = new ArrayList();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class PoseLandmarkHolder {
        private final int zza;
        private final float zzb;
        private final float zzc;
        private final float zzd;
        private final float zze;

        public PoseLandmarkHolder(int i, float f, float f2, float f3, float f4) {
            this.zza = i;
            this.zzb = f;
            this.zzc = f2;
            this.zzd = f3;
            this.zze = f4;
        }

        public float getInFrameLikelihood() {
            return this.zze;
        }

        public int getIndex() {
            return this.zza;
        }

        public float getX() {
            return this.zzb;
        }

        public float getY() {
            return this.zzc;
        }

        public float getZ() {
            return this.zzd;
        }
    }

    public PoseHolder(jzl jzlVar) {
        int i = 0;
        for (zyl zylVar : jzlVar.o()) {
            this.zza.add(new PoseLandmarkHolder(i, zylVar.o(), zylVar.p(), zylVar.q(), zylVar.n()));
            i++;
        }
    }

    public List<PoseLandmarkHolder> getPoseLandmarkHolders() {
        return this.zza;
    }
}
