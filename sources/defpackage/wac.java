package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wac extends m27 {
    public final int m;
    public final int n;
    public jac o;
    public kac p;

    public wac(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.m = 21;
            this.n = 22;
        } else {
            this.m = 22;
            this.n = 21;
        }
    }

    @Override // defpackage.m27, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        z9c z9cVar;
        int i;
        kac kacVar;
        int pointToPosition;
        int i2;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                z9cVar = (z9c) headerViewListAdapter.getWrappedAdapter();
            } else {
                z9cVar = (z9c) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < z9cVar.getCount()) {
                kacVar = z9cVar.b(i2);
            } else {
                kacVar = null;
            }
            kac kacVar2 = this.p;
            if (kacVar2 != kacVar) {
                cac cacVar = z9cVar.a;
                if (kacVar2 != null) {
                    this.o.c(cacVar, kacVar2);
                }
                this.p = kacVar;
                if (kacVar != null) {
                    this.o.h(cacVar, kacVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        z9c z9cVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i == this.n) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                z9cVar = (z9c) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                z9cVar = (z9c) adapter;
            }
            z9cVar.a.c(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(jac jacVar) {
        this.o = jacVar;
    }

    @Override // defpackage.m27, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
