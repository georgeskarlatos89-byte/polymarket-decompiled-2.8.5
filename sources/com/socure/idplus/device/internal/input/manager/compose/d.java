package com.socure.idplus.device.internal.input.manager.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.socure.idplus.device.internal.behavior.model.InputChangeAction;
import com.socure.idplus.device.internal.behavior.model.InputChangeEvent;
import com.socure.idplus.device.internal.input.manager.g;
import defpackage.c10;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d extends g {
    public final com.socure.idplus.device.internal.input.producer.b c;
    public final com.socure.idplus.device.internal.input.producer.c d;
    public String e;
    public final Rect f;
    public String g;
    public String h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, com.socure.idplus.device.internal.input.producer.b bVar, com.socure.idplus.device.internal.input.producer.c cVar, com.socure.idplus.device.internal.input.manager.monitor.a aVar) {
        super(context, aVar);
        context.getClass();
        bVar.getClass();
        cVar.getClass();
        aVar.getClass();
        this.c = bVar;
        this.d = cVar;
        this.f = new Rect();
        this.g = "";
    }

    public final String a(Rect rect) {
        rect.getClass();
        return this.g + "_" + rect.left + "_" + rect.top + "_" + rect.bottom + "_" + rect.right;
    }

    @Override // com.socure.idplus.device.internal.input.manager.g
    public final void b() {
        this.e = null;
        this.f.set(0, 0, 0, 0);
        this.g = "";
        this.h = null;
        this.i = false;
    }

    @Override // com.socure.idplus.device.internal.input.manager.g
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.i = false;
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
    }

    public final void a(String str, String str2, InputChangeAction inputChangeAction) {
        str.getClass();
        str2.getClass();
        inputChangeAction.getClass();
        this.h = str;
        com.socure.idplus.device.internal.input.producer.c cVar = this.d;
        InputChangeEvent inputChangeEvent = new InputChangeEvent(SystemClock.uptimeMillis(), Intrinsics.areEqual(this.e, str2), inputChangeAction);
        cVar.getClass();
        cVar.a(inputChangeEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        r0 = r3.getClass().getSimpleName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view) {
        Context context;
        this.i = true;
        String str = "unknown";
        if (view != null) {
            try {
                context = view.getContext();
            } catch (Exception unused) {
            }
        } else {
            context = null;
        }
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        this.g = str;
        try {
            c10.a = new c(this);
        } catch (Exception | NoSuchMethodError unused2) {
        }
    }

    @Override // com.socure.idplus.device.internal.input.manager.g
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        a((View) viewGroup);
    }

    @Override // com.socure.idplus.device.internal.input.manager.g
    public final void a(View view, boolean z) {
        if (this.i || !(view instanceof ComposeView)) {
            return;
        }
        a(view);
    }
}
