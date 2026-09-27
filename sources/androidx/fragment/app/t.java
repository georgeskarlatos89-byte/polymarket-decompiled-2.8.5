package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import defpackage.aob;
import defpackage.b3h;
import defpackage.gid;
import defpackage.kgg;
import defpackage.km8;
import defpackage.l05;
import defpackage.m6b;
import defpackage.n6b;
import defpackage.p7b;
import defpackage.pk4;
import defpackage.wm8;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class t extends pk4 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final p7b mFragmentLifecycleRegistry;
    final km8 mFragments;
    boolean mResumed;
    boolean mStopped;

    public t() {
        this.mFragments = new km8(new s(this));
        this.mFragmentLifecycleRegistry = new p7b(this, true);
        this.mStopped = true;
        f();
    }

    public static boolean g(a0 a0Var, n6b n6bVar) {
        boolean z = false;
        for (o oVar : a0Var.c.f()) {
            if (oVar != null) {
                if (oVar.getHost() != null) {
                    z |= g(oVar.getChildFragmentManager(), n6bVar);
                }
                g0 g0Var = oVar.mViewLifecycleOwner;
                if (g0Var != null) {
                    g0Var.b();
                    if (g0Var.e.d.a(n6b.STARTED)) {
                        oVar.mViewLifecycleOwner.e.h(n6bVar);
                        z = true;
                    }
                }
                if (oVar.mLifecycleRegistry.d.a(n6b.STARTED)) {
                    oVar.mLifecycleRegistry.h(n6bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.d.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            aob.a(this).b(str2, printWriter);
        }
        this.mFragments.a.d.v(str, fileDescriptor, printWriter, strArr);
    }

    public final void f() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new kgg() { // from class: androidx.fragment.app.p
            @Override // defpackage.kgg
            public final Bundle a() {
                t tVar = t.this;
                tVar.markFragmentsCreated();
                tVar.mFragmentLifecycleRegistry.f(m6b.ON_STOP);
                return new Bundle();
            }
        });
        final int i = 0;
        addOnConfigurationChangedListener(new l05(this) { // from class: androidx.fragment.app.q
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.l05
            public final void accept(Object obj) {
                int i2 = i;
                t tVar = this.b;
                switch (i2) {
                    case 0:
                        tVar.mFragments.a();
                        return;
                    default:
                        tVar.mFragments.a();
                        return;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new l05(this) { // from class: androidx.fragment.app.q
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.l05
            public final void accept(Object obj) {
                int i22 = i2;
                t tVar = this.b;
                switch (i22) {
                    case 0:
                        tVar.mFragments.a();
                        return;
                    default:
                        tVar.mFragments.a();
                        return;
                }
            }
        });
        addOnContextAvailableListener(new gid() { // from class: androidx.fragment.app.r
            @Override // defpackage.gid
            public final void a(pk4 pk4Var) {
                s sVar = t.this.mFragments.a;
                sVar.d.b(sVar, sVar, null);
            }
        });
    }

    public a0 getSupportFragmentManager() {
        return this.mFragments.a.d;
    }

    @Deprecated
    public aob getSupportLoaderManager() {
        return aob.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (g(getSupportFragmentManager(), n6b.CREATED));
    }

    @Override // defpackage.pk4, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.pk4, defpackage.ok4, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(m6b.ON_CREATE);
        wm8 wm8Var = this.mFragments.a.d;
        wm8Var.I = false;
        wm8Var.J = false;
        wm8Var.P.g = false;
        wm8Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.d.l();
        this.mFragmentLifecycleRegistry.f(m6b.ON_DESTROY);
    }

    @Override // defpackage.pk4, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.d.u(5);
        this.mFragmentLifecycleRegistry.f(m6b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.pk4, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.d.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(m6b.ON_RESUME);
        wm8 wm8Var = this.mFragments.a.d;
        wm8Var.I = false;
        wm8Var.J = false;
        wm8Var.P.g = false;
        wm8Var.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            wm8 wm8Var = this.mFragments.a.d;
            wm8Var.I = false;
            wm8Var.J = false;
            wm8Var.P.g = false;
            wm8Var.u(4);
        }
        this.mFragments.a.d.z(true);
        this.mFragmentLifecycleRegistry.f(m6b.ON_START);
        wm8 wm8Var2 = this.mFragments.a.d;
        wm8Var2.I = false;
        wm8Var2.J = false;
        wm8Var2.P.g = false;
        wm8Var2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        wm8 wm8Var = this.mFragments.a.d;
        wm8Var.J = true;
        wm8Var.P.g = true;
        wm8Var.u(4);
        this.mFragmentLifecycleRegistry.f(m6b.ON_STOP);
    }

    public void setEnterSharedElementCallback(b3h b3hVar) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(b3h b3hVar) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(o oVar, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            oVar.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(o oVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            oVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public void startActivityFromFragment(o oVar, Intent intent, int i) {
        startActivityFromFragment(oVar, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(o oVar) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public t(int i) {
        super(i);
        this.mFragments = new km8(new s(this));
        this.mFragmentLifecycleRegistry = new p7b(this, true);
        this.mStopped = true;
        f();
    }
}
