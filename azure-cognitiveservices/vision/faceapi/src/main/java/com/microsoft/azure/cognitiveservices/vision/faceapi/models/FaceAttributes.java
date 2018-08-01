/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Face Attributes.
 */
public class FaceAttributes {
    /**
     * Age in years.
     */
    @JsonProperty(value = "age")
    private Double age;

    /**
     * Possible gender of the face. Possible values include: 'male', 'female',
     * 'genderless'.
     */
    @JsonProperty(value = "gender")
    private Gender gender;

    /**
     * Smile intensity, a number between [0,1].
     */
    @JsonProperty(value = "smile")
    private Double smile;

    /**
     * Properties describing facial hair attributes.
     */
    @JsonProperty(value = "facialHair")
    private FacialHair facialHair;

    /**
     * Glasses type if any of the face. Possible values include: 'noGlasses',
     * 'readingGlasses', 'sunglasses', 'swimmingGoggles'.
     */
    @JsonProperty(value = "glasses")
    private GlassesType glasses;

    /**
     * Properties indicating head pose of the face.
     */
    @JsonProperty(value = "headPose")
    private HeadPose headPose;

    /**
     * Properties describing facial emotion in form of confidence ranging from
     * 0 to 1.
     */
    @JsonProperty(value = "emotion")
    private Emotion emotion;

    /**
     * Properties describing hair attributes.
     */
    @JsonProperty(value = "hair")
    private Hair hair;

    /**
     * Properties describing present makeups on a given face.
     */
    @JsonProperty(value = "makeup")
    private Makeup makeup;

    /**
     * Properties describing occlusions on a given face.
     */
    @JsonProperty(value = "occlusion")
    private Occlusion occlusion;

    /**
     * Properties describing any accessories on a given face.
     */
    @JsonProperty(value = "accessories")
    private List<Accessory> accessories;

    /**
     * Properties describing any presence of blur within the image.
     */
    @JsonProperty(value = "blur")
    private Blur blur;

    /**
     * Properties describing exposure level of the image.
     */
    @JsonProperty(value = "exposure")
    private Exposure exposure;

    /**
     * Properties describing noise level of the image.
     */
    @JsonProperty(value = "noise")
    private Noise noise;

    /**
     * Get age in years.
     *
     * @return the age value
     */
    public Double age() {
        return this.age;
    }

    /**
     * Set age in years.
     *
     * @param age the age value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withAge(Double age) {
        this.age = age;
        return this;
    }

    /**
     * Get possible gender of the face. Possible values include: 'male', 'female', 'genderless'.
     *
     * @return the gender value
     */
    public Gender gender() {
        return this.gender;
    }

    /**
     * Set possible gender of the face. Possible values include: 'male', 'female', 'genderless'.
     *
     * @param gender the gender value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Get smile intensity, a number between [0,1].
     *
     * @return the smile value
     */
    public Double smile() {
        return this.smile;
    }

    /**
     * Set smile intensity, a number between [0,1].
     *
     * @param smile the smile value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withSmile(Double smile) {
        this.smile = smile;
        return this;
    }

    /**
     * Get properties describing facial hair attributes.
     *
     * @return the facialHair value
     */
    public FacialHair facialHair() {
        return this.facialHair;
    }

    /**
     * Set properties describing facial hair attributes.
     *
     * @param facialHair the facialHair value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withFacialHair(FacialHair facialHair) {
        this.facialHair = facialHair;
        return this;
    }

    /**
     * Get glasses type if any of the face. Possible values include: 'noGlasses', 'readingGlasses', 'sunglasses', 'swimmingGoggles'.
     *
     * @return the glasses value
     */
    public GlassesType glasses() {
        return this.glasses;
    }

    /**
     * Set glasses type if any of the face. Possible values include: 'noGlasses', 'readingGlasses', 'sunglasses', 'swimmingGoggles'.
     *
     * @param glasses the glasses value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withGlasses(GlassesType glasses) {
        this.glasses = glasses;
        return this;
    }

    /**
     * Get properties indicating head pose of the face.
     *
     * @return the headPose value
     */
    public HeadPose headPose() {
        return this.headPose;
    }

    /**
     * Set properties indicating head pose of the face.
     *
     * @param headPose the headPose value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withHeadPose(HeadPose headPose) {
        this.headPose = headPose;
        return this;
    }

    /**
     * Get properties describing facial emotion in form of confidence ranging from 0 to 1.
     *
     * @return the emotion value
     */
    public Emotion emotion() {
        return this.emotion;
    }

    /**
     * Set properties describing facial emotion in form of confidence ranging from 0 to 1.
     *
     * @param emotion the emotion value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withEmotion(Emotion emotion) {
        this.emotion = emotion;
        return this;
    }

    /**
     * Get properties describing hair attributes.
     *
     * @return the hair value
     */
    public Hair hair() {
        return this.hair;
    }

    /**
     * Set properties describing hair attributes.
     *
     * @param hair the hair value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withHair(Hair hair) {
        this.hair = hair;
        return this;
    }

    /**
     * Get properties describing present makeups on a given face.
     *
     * @return the makeup value
     */
    public Makeup makeup() {
        return this.makeup;
    }

    /**
     * Set properties describing present makeups on a given face.
     *
     * @param makeup the makeup value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withMakeup(Makeup makeup) {
        this.makeup = makeup;
        return this;
    }

    /**
     * Get properties describing occlusions on a given face.
     *
     * @return the occlusion value
     */
    public Occlusion occlusion() {
        return this.occlusion;
    }

    /**
     * Set properties describing occlusions on a given face.
     *
     * @param occlusion the occlusion value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withOcclusion(Occlusion occlusion) {
        this.occlusion = occlusion;
        return this;
    }

    /**
     * Get properties describing any accessories on a given face.
     *
     * @return the accessories value
     */
    public List<Accessory> accessories() {
        return this.accessories;
    }

    /**
     * Set properties describing any accessories on a given face.
     *
     * @param accessories the accessories value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
        return this;
    }

    /**
     * Get properties describing any presence of blur within the image.
     *
     * @return the blur value
     */
    public Blur blur() {
        return this.blur;
    }

    /**
     * Set properties describing any presence of blur within the image.
     *
     * @param blur the blur value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withBlur(Blur blur) {
        this.blur = blur;
        return this;
    }

    /**
     * Get properties describing exposure level of the image.
     *
     * @return the exposure value
     */
    public Exposure exposure() {
        return this.exposure;
    }

    /**
     * Set properties describing exposure level of the image.
     *
     * @param exposure the exposure value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withExposure(Exposure exposure) {
        this.exposure = exposure;
        return this;
    }

    /**
     * Get properties describing noise level of the image.
     *
     * @return the noise value
     */
    public Noise noise() {
        return this.noise;
    }

    /**
     * Set properties describing noise level of the image.
     *
     * @param noise the noise value to set
     * @return the FaceAttributes object itself.
     */
    public FaceAttributes withNoise(Noise noise) {
        this.noise = noise;
        return this;
    }

}