/*
 * *
 * Creator: Tobiloba Adejumo on 4/30/19 9:12 AM Last modified: 4/30/19 9:12 AM Copyright: All rights reserved Ⓒ 2019
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language governing
 *    permissions and limitations under the License.
 * /
 */

package com.themavencoder.spaceam.fragments.food;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by themavencoder on 30,April,2019
 */
public class FoodData {

    int image;
    String name;
 public FoodData(int image, String name) {
     this.name = name;
     this.image = image;


 }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
