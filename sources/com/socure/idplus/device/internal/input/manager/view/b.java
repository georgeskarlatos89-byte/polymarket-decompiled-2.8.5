package com.socure.idplus.device.internal.input.manager.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.socure.idplus.device.internal.input.manager.g;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b extends g {
    public final com.socure.idplus.device.internal.input.producer.b c;
    public final com.socure.idplus.device.internal.input.producer.c d;
    public int e;
    public int f;
    public String g;
    public final WeakHashMap h;
    public final ViewTreeObserver.OnGlobalFocusChangeListener i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, com.socure.idplus.device.internal.input.producer.b bVar, com.socure.idplus.device.internal.input.producer.c cVar, com.socure.idplus.device.internal.input.manager.monitor.a aVar) {
        super(context, aVar);
        context.getClass();
        bVar.getClass();
        cVar.getClass();
        aVar.getClass();
        this.c = bVar;
        this.d = cVar;
        this.e = 1;
        this.g = "";
        this.h = new WeakHashMap();
        this.i = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.socure.idplus.device.internal.input.manager.view.c
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                b.a(b.this, view, view2);
            }
        };
    }

    @Override // com.socure.idplus.device.internal.input.manager.g
    public final void a(View view, boolean z) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            WeakHashMap weakHashMap = this.h;
            if (z) {
                if (weakHashMap.get(editText) == null) {
                    WeakHashMap weakHashMap2 = this.h;
                    int i = this.e;
                    this.e = i + 1;
                    weakHashMap2.put(editText, new a(this, i));
                }
                a aVar = (a) this.h.get(editText);
                if (aVar != null) {
                    editText.addTextChangedListener(aVar);
                }
            } else {
                a aVar2 = (a) weakHashMap.get(editText);
                if (aVar2 != null) {
                    editText.removeTextChangedListener(aVar2);
                }
                this.h.remove(editText);
            }
            if (editText.hasFocus()) {
                if (z) {
                    a(editText, true);
                } else {
                    a(editText, false);
                }
            }
        }
    }

    @Override // com.socure.idplus.device.internal.input.manager.g
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        viewGroup.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.i);
    }

    @Override // com.socure.idplus.device.internal.input.manager.g
    public final void b() {
        this.f = 0;
        this.e = 1;
        this.h.clear();
    }

    public final void a(EditText editText, boolean z) {
        a aVar = (a) this.h.get(editText);
        int i = aVar != null ? aVar.a : 0;
        if (z) {
            this.f = i;
            this.g = "";
        } else if (this.f == i) {
            this.f = 0;
        }
        this.c.a(z);
    }

    @Override // com.socure.idplus.device.internal.input.manager.g
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        viewGroup.getViewTreeObserver().addOnGlobalFocusChangeListener(this.i);
    }

    public static final void a(b bVar, View view, View view2) {
        if (view instanceof EditText) {
            bVar.a((EditText) view, false);
        }
        if (view2 instanceof EditText) {
            bVar.a((EditText) view2, true);
        }
    }
}
