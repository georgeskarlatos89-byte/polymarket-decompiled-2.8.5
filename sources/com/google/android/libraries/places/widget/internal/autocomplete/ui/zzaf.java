package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.internal.zzqv;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaf extends AnimatorListenerAdapter {
    final /* synthetic */ View zza;
    final /* synthetic */ g zzb;
    final /* synthetic */ ViewPropertyAnimator zzc;
    final /* synthetic */ zzag zzd;

    public zzaf(zzag zzagVar, View view, g gVar, ViewPropertyAnimator viewPropertyAnimator) {
        this.zza = view;
        this.zzb = gVar;
        this.zzc = viewPropertyAnimator;
        Objects.requireNonNull(zzagVar);
        this.zzd = zzagVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        try {
            zzag.zzb(this.zza);
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        try {
            ViewPropertyAnimator viewPropertyAnimator = this.zzc;
            viewPropertyAnimator.setListener(null);
            zzag zzagVar = this.zzd;
            g gVar = this.zzb;
            zzagVar.dispatchAddFinished(gVar);
            zzagVar.zzc().remove(gVar);
            zzagVar.zza();
            viewPropertyAnimator.setStartDelay(0L);
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        try {
            this.zza.setAlpha(0.0f);
            this.zzd.dispatchAddStarting(this.zzb);
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }
}
