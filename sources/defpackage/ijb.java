package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ijb implements bbc, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public cac c;
    public ExpandedMenuView d;
    public abc e;
    public hjb f;

    public ijb(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, abc, android.content.DialogInterface$OnKeyListener, eac, java.lang.Object, android.content.DialogInterface$OnDismissListener] */
    @Override // defpackage.bbc
    public final boolean b(fai faiVar) {
        boolean hasVisibleItems = faiVar.hasVisibleItems();
        Context context = faiVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.a = faiVar;
        im imVar = new im(context);
        ijb ijbVar = new ijb(imVar.getContext());
        obj.c = ijbVar;
        ijbVar.e = obj;
        faiVar.b(ijbVar, context);
        ijb ijbVar2 = obj.c;
        hjb hjbVar = ijbVar2.f;
        if (hjbVar == null) {
            hjbVar = new hjb(ijbVar2);
            ijbVar2.f = hjbVar;
        }
        imVar.setAdapter(hjbVar, obj);
        View view = faiVar.o;
        if (view != null) {
            imVar.setCustomTitle(view);
        } else {
            imVar.setIcon(faiVar.n).setTitle(faiVar.m);
        }
        imVar.setOnKeyListener(obj);
        jm create = imVar.create();
        obj.b = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.b.show();
        abc abcVar = this.e;
        if (abcVar != null) {
            abcVar.p(faiVar);
            return true;
        }
        return true;
    }

    @Override // defpackage.bbc
    public final boolean c(kac kacVar) {
        return false;
    }

    @Override // defpackage.bbc
    public final void d(abc abcVar) {
        throw null;
    }

    @Override // defpackage.bbc
    public final void e() {
        hjb hjbVar = this.f;
        if (hjbVar != null) {
            hjbVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.bbc
    public final boolean f() {
        return false;
    }

    @Override // defpackage.bbc
    public final void g(cac cacVar, boolean z) {
        abc abcVar = this.e;
        if (abcVar != null) {
            abcVar.g(cacVar, z);
        }
    }

    @Override // defpackage.bbc
    public final boolean h(kac kacVar) {
        return false;
    }

    @Override // defpackage.bbc
    public final void i(Context context, cac cacVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = cacVar;
        hjb hjbVar = this.f;
        if (hjbVar != null) {
            hjbVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.b(i), this, 0);
    }
}
