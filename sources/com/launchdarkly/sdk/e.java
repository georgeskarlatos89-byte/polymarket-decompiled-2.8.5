package com.launchdarkly.sdk;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class e {
    public ArrayList a;

    public final void a(LDContext lDContext) {
        if (lDContext != null) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            if (lDContext.p()) {
                for (LDContext lDContext2 : lDContext.multiContexts) {
                    this.a.add(lDContext2);
                }
                return;
            }
            this.a.add(lDContext);
        }
    }

    public final LDContext b() {
        ArrayList arrayList = this.a;
        if (arrayList != null && arrayList.size() != 0) {
            int size = this.a.size();
            ArrayList arrayList2 = this.a;
            if (size == 1) {
                return (LDContext) arrayList2.get(0);
            }
            return LDContext.b((LDContext[]) arrayList2.toArray(new LDContext[arrayList2.size()]));
        }
        return new LDContext("multi-kind context must contain at least one kind");
    }
}
