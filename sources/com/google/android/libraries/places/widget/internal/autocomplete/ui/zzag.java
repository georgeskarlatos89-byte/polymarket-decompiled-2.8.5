package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzqv;
import defpackage.l66;
import defpackage.xv7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzag extends l66 {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final int zzd;

    public zzag(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(R.dimen.places_autocomplete_vertical_dropdown);
    }

    public static /* synthetic */ void zzb(View view) {
        zzf(view);
    }

    private final void zzd(g gVar) {
        List list = this.zzc;
        View view = gVar.itemView;
        list.add(gVar);
        long layoutPosition = (gVar.getLayoutPosition() * 67) + getMoveDuration();
        view.setTranslationY(-this.zzd);
        view.setAlpha(0.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new xv7()).setStartDelay(layoutPosition);
        animate.setListener(new zzaf(this, view, gVar, animate)).start();
    }

    private final void zze() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    private static void zzf(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // defpackage.l66, defpackage.f7h
    public final boolean animateAdd(g gVar) {
        try {
            endAnimation(gVar);
            gVar.itemView.setAlpha(0.0f);
            if (gVar instanceof zzal) {
                if (((zzal) gVar).zzb()) {
                    this.zza.add(gVar);
                    return true;
                }
                this.zzb.add(gVar);
                return true;
            }
            if (((zzq) gVar).zzb()) {
                this.zza.add(gVar);
                return true;
            }
            this.zzb.add(gVar);
            return true;
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    @Override // defpackage.l66, androidx.recyclerview.widget.d
    public final void endAnimation(g gVar) {
        try {
            super.endAnimation(gVar);
            if (this.zza.remove(gVar)) {
                zzf(gVar.itemView);
                dispatchAddFinished(gVar);
            }
            zze();
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    @Override // defpackage.l66, androidx.recyclerview.widget.d
    public final void endAnimations() {
        try {
            List list = this.zza;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                g gVar = (g) list.get(size);
                zzf(gVar.itemView);
                dispatchAddFinished(gVar);
                list.remove(size);
            }
            List list2 = this.zzc;
            int size2 = list2.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    ((g) list2.get(size2)).itemView.animate().cancel();
                } else {
                    super.endAnimations();
                    return;
                }
            }
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    @Override // defpackage.l66, androidx.recyclerview.widget.d
    public final boolean isRunning() {
        try {
            if (!super.isRunning() && this.zzb.isEmpty() && this.zza.isEmpty()) {
                if (this.zzc.isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    @Override // defpackage.l66, androidx.recyclerview.widget.d
    public final void runPendingAnimations() {
        try {
            List list = this.zzb;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                super.animateAdd((g) it.next());
            }
            list.clear();
            super.runPendingAnimations();
            List list2 = this.zza;
            if (!list2.isEmpty()) {
                ArrayList arrayList = new ArrayList(list2);
                list2.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    g gVar = (g) it2.next();
                    View view = gVar.itemView;
                    this.zzc.add(gVar);
                    long layoutPosition = (gVar.getLayoutPosition() * 67) + getMoveDuration();
                    view.setTranslationY(-this.zzd);
                    view.setAlpha(0.0f);
                    ViewPropertyAnimator animate = view.animate();
                    animate.cancel();
                    animate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new xv7()).setStartDelay(layoutPosition);
                    animate.setListener(new zzaf(this, view, gVar, animate)).start();
                }
            }
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ void zza() {
        zze();
    }

    public final /* synthetic */ List zzc() {
        return this.zzc;
    }
}
