package com.google.android.libraries.places.internal;

import defpackage.sv6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzchl {
    public static final zzchl zza;
    public static final zzchl zzb;
    public static final zzchl zzc;
    public static final zzchl zzd;
    public static final zzchl zze;
    public static final zzchl zzf;
    public static final zzchl zzg;
    public static final zzchl zzh;
    public static final zzchl zzi;
    public static final zzchl zzj;
    public static final zzchl zzk;
    public static final zzchl zzl;
    public static final zzchl zzm;
    public static final zzchl zzn;
    private static final zzchl[] zzo;
    private static final /* synthetic */ zzchl[] zzr;
    private final int zzp;
    private final zzccd zzq;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:230)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:144)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
        */
    static {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzchl.<clinit>():void");
    }

    private zzchl(String str, int i, int i2, zzccd zzccdVar) {
        this.zzp = i2;
        String concat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (zzccdVar.zzh() != null) {
            String zzh2 = zzccdVar.zzh();
            int length = concat.length();
            concat = sv6.p(new StringBuilder(String.valueOf(zzh2).length() + length + 2 + 1), concat, " (", zzh2, ")");
        }
        this.zzq = zzccdVar.zze(concat);
    }

    public static zzchl[] values() {
        return (zzchl[]) zzr.clone();
    }

    public static zzchl zza(long j) {
        zzchl[] zzchlVarArr = zzo;
        if (j < zzchlVarArr.length && j >= 0) {
            return zzchlVarArr[(int) j];
        }
        return null;
    }

    public static zzccd zzb(long j) {
        zzchl zza2 = zza(j);
        if (zza2 == null) {
            zzccd zza3 = zzccd.zza(zzc.zzq.zzg().zza());
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 32);
            sb.append("Unrecognized HTTP/2 error code: ");
            sb.append(j);
            return zza3.zze(sb.toString());
        }
        return zza2.zzq;
    }
}
