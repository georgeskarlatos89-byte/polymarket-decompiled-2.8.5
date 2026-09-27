package com.socure.idplus.device.internal.input.manager;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class g {
    public final ClipboardManager a;
    public final com.socure.idplus.device.internal.input.manager.monitor.a b;

    public g(Context context, com.socure.idplus.device.internal.input.manager.monitor.a aVar) {
        context.getClass();
        aVar.getClass();
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.a = (ClipboardManager) systemService;
        this.b = aVar;
    }

    public final CharSequence a() {
        ClipData.Item itemAt;
        ClipData primaryClip = this.a.getPrimaryClip();
        if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null) {
            return itemAt.getText();
        }
        return null;
    }

    public abstract void a(View view, boolean z);

    public abstract void a(ViewGroup viewGroup);

    public abstract void b();

    public abstract void b(ViewGroup viewGroup);
}
