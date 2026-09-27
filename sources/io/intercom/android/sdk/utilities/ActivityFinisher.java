package io.intercom.android.sdk.utilities;

import android.app.Activity;
import defpackage.ll0;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ActivityFinisher {
    private final Set<Activity> activities = new ll0();

    public void finishActivities() {
        Iterator<Activity> it = this.activities.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        this.activities.clear();
    }

    public void register(Activity activity) {
        this.activities.add(activity);
    }

    public void unregister(Activity activity) {
        this.activities.remove(activity);
    }
}
