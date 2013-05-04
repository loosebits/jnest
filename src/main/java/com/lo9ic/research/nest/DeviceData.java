package com.lo9ic.research.nest;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DeviceData {
	public double heat_pump_comp_threshold;
	public double learning_days_completed_cool;
	public String backplate_bsl_version;
	public boolean switch_system_off;
	public String local_ip;
	public double away_temperature_high;
	public String current_schedule_mode;
	public double leaf_threshold_cool;
	public String hvac_wires;
	public boolean fan_cooling_state;
	public boolean leaf;
	public String type;
	public boolean switch_preconditioning_control;
	public String click_sound;
	public boolean away_temperature_low_enabled;
	public boolean has_x2_heat;
	public String fan_mode;
	public boolean heat_pump_comp_threshold_enabled;
	public double rssi;
	public double leaf_away_high;
	public String fan_cooling_readiness;
	public double capability_level;
	public boolean schedule_learning_reset;
	public String temperature_scale;
	public double battery_level;
	public String ob_orientation;
	public String hvac_pins;
	public boolean away_temperature_high_enabled;
	public double learning_days_completed_heat;
	public boolean range_enable;
	public boolean auto_away_enable;
	public boolean upper_safety_temp_enabled;
	public boolean lower_safety_temp_enabled;
	public boolean has_fan;
	public double current_humidity;
	public String postal_code;
	public String backplate_mono_version;
	public boolean range_mode;
	public String nlclient_state;
	public boolean has_heat_pump;
	public String current_version;
	public String learning_state;
	public boolean auto_away_reset;
	public double away_temperature_low;
	public boolean temperature_lock;
	public double upper_safety_temp;
	public String time_to_target_training;
	public double target_time_confidence;
	public String backplate_serial_number;
	public boolean forced_air;
	public String backplate_mono_info;
	public double leaf_threshold_heat;
	public double learning_time;
	public double creation_time;
	public double learning_days_completed_range;
	public double leaf_schedule_delta;
	public boolean learning_mode;
	public String leaf_learning;
	public boolean has_aux_heat;
	public String backplate_bsl_info;
	public String user_brightness;
	public double leaf_away_low;
	public String serial_number;
	public String mac_address;
	public double lower_safety_temp;
	public double time_to_target;
	public String equipment_type;
	public String backplate_model;
	public String model_version;
	public boolean heat_pump_aux_threshold_enabled;
	public double heat_pump_aux_threshold;
	public DeviceData () {}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
