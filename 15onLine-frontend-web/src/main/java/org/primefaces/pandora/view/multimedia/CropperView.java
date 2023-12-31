/**
 *  Copyright 2009-2020 PrimeTek.
 *
 *  Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.primefaces.pandora.view.multimedia;

import org.primefaces.model.CroppedImage;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;
import javax.inject.Named;
import java.io.File;

@Named
@RequestScoped
public class CropperView {
    
    private CroppedImage croppedImage;
	
	private String newImageName;

	public CroppedImage getCroppedImage() {
		return croppedImage;
	}

	public void setCroppedImage(CroppedImage croppedImage) {
		this.croppedImage = croppedImage;
	}

	public void crop() {
		if(croppedImage == null) {
			return;
        }
		
		setNewImageName(getRandomImageName());
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		String newFileName = externalContext.getRealPath("") + File.separator + "resources" + File.separator + "demo" +
                    File.separator + "images" + File.separator + "crop" + File.separator + getNewImageName() + ".jpg";
		
		FileImageOutputStream imageOutput;
		try {
			imageOutput = new FileImageOutputStream(new File(newFileName));
			imageOutput.write(croppedImage.getBytes(), 0, croppedImage.getBytes().length);
			imageOutput.close();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Cropping failed."));
			return;
		}
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Cropping finished."));
	}
	
	private String getRandomImageName() {
		int i = (int) (Math.random() * 100000);
		
		return String.valueOf(i);
	}
	
	public String getNewImageName() {
		return newImageName;
	}

	public void setNewImageName(String newImageName) {
		this.newImageName = newImageName;
	}
}
