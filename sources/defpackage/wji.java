package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wji implements tak {
    public final WeakReference a;
    public int b;
    public int c;

    public wji(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.tak
    public final void onPageScrollStateChanged(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.V = this.c;
        }
    }

    @Override // defpackage.tak
    public final void onPageScrolled(int i, float f, int i2) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z2 = true;
            if (i3 == 2 && this.b != 1) {
                z = true;
                z2 = false;
            } else {
                z = true;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.l(i, f, z2, z, false);
        }
    }

    @Override // defpackage.tak
    public final void onPageSelected(int i) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
            int i2 = this.c;
            if (i2 != 0 && (i2 != 2 || this.b != 0)) {
                z = false;
            } else {
                z = true;
            }
            tabLayout.j(tabLayout.f(i), z);
        }
    }
}
