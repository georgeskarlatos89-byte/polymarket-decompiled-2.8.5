package com.google.mlkit.vision.text.internal;

import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import defpackage.swn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzo {
    private final zzp zza;
    private final ExecutorSelector zzb;

    public zzo(zzp zzpVar, ExecutorSelector executorSelector) {
        this.zza = zzpVar;
        this.zzb = executorSelector;
    }

    public final TextRecognizer zza(TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
        return new zzn((TextRecognizerTaskWithResource) this.zza.get(textRecognizerOptionsInterface), this.zzb.getExecutorToUse(textRecognizerOptionsInterface.getExecutor()), swn.f(textRecognizerOptionsInterface.getLoggingLibraryName()), textRecognizerOptionsInterface);
    }
}
