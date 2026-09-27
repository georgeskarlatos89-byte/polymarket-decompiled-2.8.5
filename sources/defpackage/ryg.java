package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ryg {
    public final SessionConfiguration a;
    public final List b;

    public ryg(int i, ArrayList arrayList, vwg vwgVar, e03 e03Var) {
        jod jodVar;
        hod hodVar;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((OutputConfiguration) ((hod) it.next()).a.a());
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, arrayList2, vwgVar, e03Var);
        this.a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList3 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                hodVar = null;
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    jodVar = new jod(outputConfiguration);
                } else {
                    jodVar = new jod(new iod(outputConfiguration));
                }
                hodVar = new hod(jodVar);
            }
            arrayList3.add(hodVar);
        }
        this.b = Collections.unmodifiableList(arrayList3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ryg)) {
            return false;
        }
        return this.a.equals(((ryg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
