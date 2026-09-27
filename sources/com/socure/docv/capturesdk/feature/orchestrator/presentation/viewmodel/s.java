package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import java.io.File;
import java.io.FileFilter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class s implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file.isFile()) {
            String name = file.getName();
            name.getClass();
            if (!kotlin.text.e.u(name, "pdf_page_", false)) {
                String name2 = file.getName();
                name2.getClass();
                if (!kotlin.text.e.u(name2, "compressed_soc_", false)) {
                    String name3 = file.getName();
                    name3.getClass();
                    if (kotlin.text.e.u(name3, "original_soc_", false)) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
