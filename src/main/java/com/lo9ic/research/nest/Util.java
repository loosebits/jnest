package com.lo9ic.research.nest;

public final class Util {
	
	public static String getFakeStatusResponse() {
		String str = "";
		str += "{";
		str += "	\"metadata\": {";
		str += "		\"01AA01AB411101F1\": {";
		str += "			\"$version\": -470698778,";
		str += "			\"$timestamp\": 1342052055000,";
		str += "			\"last_connection\": 1342052055062,";
		str += "			\"last_ip\": \"67.165.219.219\"";
		str += "		}";
		str += "	},";
		str += "	\"track\": {";
		str += "		\"01AA01AB411101F1\": {";
		str += "			\"$version\": 46423532,";
		str += "			\"$timestamp\": 1342052055095,";
		str += "			\"online\": true,";
		str += "			\"last_connection\": 1342052055095,";
		str += "			\"last_ip\": \"67.165.219.219\"";
		str += "		}";
		str += "	},";
		str += "	\"user_settings\": {";
		str += "		\"5005\": {";
		str += "			\"$version\": 1864358976,";
		str += "			\"$timestamp\": 1340213094527,";
		str += "			\"email_verified\": true,";
		str += "			\"tos_accepted_version\": 1319500800000,";
		str += "			\"receive_marketing_emails\": true,";
		str += "			\"receive_nest_emails\": true,";
		str += "			\"receive_support_emails\": true,";
		str += "			\"max_structures\": 2,";
		str += "			\"max_thermostats\": 10,";
		str += "			\"max_thermostats_per_structure\": 10,";
		str += "			\"tos_minimum_version\": 1319500800000,";
		str += "			\"tos_current_version\": 1319500800000";
		str += "		}";
		str += "	},";
		str += "	\"structure\": {";
		str += "		\"df6b6720-1df0-11e1-8900-1231381520b0\": {";
		str += "			\"$version\": -1395287873,";
		str += "			\"$timestamp\": 1341869932000,";
		str += "			\"away_timestamp\": 1341869828,";
		str += "			\"away\": false,";
		str += "			\"location\": \"Boulder, CO\",";
		str += "			\"name\": \"Home\",";
		str += "			\"postal_code\": \"80305\",";
		str += "			\"creation_time\": 1322945617554,";
		str += "			\"street_address\": \"623 Hartford Drive\",";
		str += "			\"devices\": [";
		str += "				\"device.01AA01AB411101F1\"";
		str += "			],";
		str += "			\"country_code\": \"US\",";
		str += "			\"user\": \"user.5005\",";
		str += "			\"away_setter\": 0";
		str += "		}";
		str += "	},";
		str += "	\"link\": {";
		str += "		\"01AA01AB411101F1\": {";
		str += "			\"$version\": -1253763031,";
		str += "			\"$timestamp\": 1322945631000,";
		str += "			\"structure\": \"structure.df6b6720-1df0-11e1-8900-1231381520b0\"";
		str += "		}";
		str += "	},";
		str += "	\"device\": {";
		str += "		\"01AA01AB411101F1\": {";
		str += "			\"$version\": 1201892049,";
		str += "			\"$timestamp\": 1342051221000,";
		str += "			\"heat_pump_comp_threshold\": -31.5,";
		str += "			\"learning_days_completed_cool\": 0,";
		str += "			\"backplate_bsl_version\": \"1.1\",";
		str += "			\"switch_system_off\": true,";
		str += "			\"local_ip\": \"10.0.1.5\",";
		str += "			\"away_temperature_high\": 26.66663,";
		str += "			\"current_schedule_mode\": \"HEAT\",";
		str += "			\"leaf_threshold_cool\": 0,";
		str += "			\"hvac_wires\": \"Heat,Fan,Rh\",";
		str += "			\"fan_cooling_state\": false,";
		str += "			\"leaf\": true,";
		str += "			\"type\": \"TBD\",";
		str += "			\"switch_preconditioning_control\": false,";
		str += "			\"click_sound\": \"on\",";
		str += "			\"away_temperature_low_enabled\": true,";
		str += "			\"has_x2_heat\": false,";
		str += "			\"fan_mode\": \"auto\",";
		str += "			\"heat_pump_comp_threshold_enabled\": false,";
		str += "			\"rssi\": 62,";
		str += "			\"leaf_away_high\": 0,";
		str += "			\"fan_cooling_readiness\": \"not ready\",";
		str += "			\"capability_level\": 2.1,";
		str += "			\"schedule_learning_reset\": false,";
		str += "			\"temperature_scale\": \"F\",";
		str += "			\"battery_level\": 3.909,";
		str += "			\"ob_orientation\": \"O\",";
		str += "			\"hvac_pins\": \"W1,Rh,G\",";
		str += "			\"away_temperature_high_enabled\": true,";
		str += "			\"learning_days_completed_heat\": 219,";
		str += "			\"range_enable\": false,";
		str += "			\"auto_away_enable\": true,";
		str += "			\"upper_safety_temp_enabled\": false,";
		str += "			\"lower_safety_temp_enabled\": true,";
		str += "			\"has_fan\": true,";
		str += "			\"current_humidity\": 53,";
		str += "			\"postal_code\": \"80305\",";
		str += "			\"backplate_mono_version\": \"3.7.3\",";
		str += "			\"range_mode\": false,";
		str += "			\"nlclient_state\": \"\",";
		str += "			\"has_heat_pump\": false,";
		str += "			\"current_version\": \"2.1\",";
		str += "			\"learning_state\": \"slow\",";
		str += "			\"auto_away_reset\": false,";
		str += "			\"away_temperature_low\": 12.77776,";
		str += "			\"temperature_lock\": false,";
		str += "			\"upper_safety_temp\": 35,";
		str += "			\"time_to_target_training\": \"training\",";
		str += "			\"target_time_confidence\": 0,";
		str += "			\"backplate_serial_number\": \"01BA01AB411102XY\",";
		str += "			\"forced_air\": true,";
		str += "			\"backplate_mono_info\": \"TFE (BP_DVT) 3.7.3 (ehs@ubuntu) 2012-03-07 10:43:21\",";
		str += "			\"leaf_threshold_heat\": 17.086014,";
		str += "			\"learning_time\": 1957,";
		str += "			\"creation_time\": 1322943061635,";
		str += "			\"learning_days_completed_range\": 0,";
		str += "			\"leaf_schedule_delta\": 1.109985,";
		str += "			\"learning_mode\": true,";
		str += "			\"leaf_learning\": \"ready\",";
		str += "			\"has_aux_heat\": false,";
		str += "			\"backplate_bsl_info\": \"BSL\",";
		str += "			\"user_brightness\": \"auto\",";
		str += "			\"leaf_away_low\": 13.587738,";
		str += "			\"serial_number\": \"01AA01AB411101F1\",";
		str += "			\"mac_address\": \"18b4300a325d\",";
		str += "			\"lower_safety_temp\": 7,";
		str += "			\"time_to_target\": 0,";
		str += "			\"equipment_type\": \"gas\",";
		str += "			\"backplate_model\": \"Backplate-1.9\",";
		str += "			\"model_version\": \"Diamond-1.10\",";
		str += "			\"heat_pump_aux_threshold_enabled\": true,";
		str += "			\"heat_pump_aux_threshold\": 10";
		str += "		}";
		str += "	},";
		str += "	\"schedule\": {";
		str += "		\"01AA01AB411101F1\": {";
		str += "			\"$version\": 108535350,";
		str += "			\"$timestamp\": 1341988370000,";
		str += "			\"days\": {";
		str += "				\"3\": {";
		str += "					\"3\": {";
		str += "						\"time\": 64800,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.292,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"2\": {";
		str += "						\"time\": 29700,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.969,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"1\": {";
		str += "						\"time\": 25200,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.363,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"0\": {";
		str += "						\"touched_by\": 1,";
		str += "						\"time\": 0,";
		str += "						\"touched_tzo\": -21600,";
		str += "						\"entry_type\": \"continuation\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\",";
		str += "						\"touched_at\": 1341988357";
		str += "					},";
		str += "					\"4\": {";
		str += "						\"time\": 78300,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\"";
		str += "					}";
		str += "				},";
		str += "				\"2\": {";
		str += "					\"3\": {";
		str += "						\"time\": 64800,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.196,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"2\": {";
		str += "						\"time\": 29700,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.969,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"1\": {";
		str += "						\"time\": 25200,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.363,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"0\": {";
		str += "						\"touched_by\": 1,";
		str += "						\"time\": 0,";
		str += "						\"touched_tzo\": -21600,";
		str += "						\"entry_type\": \"continuation\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\",";
		str += "						\"touched_at\": 1341988357";
		str += "					},";
		str += "					\"4\": {";
		str += "						\"time\": 78300,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\"";
		str += "					}";
		str += "				},";
		str += "				\"1\": {";
		str += "					\"3\": {";
		str += "						\"time\": 64800,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.196,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"2\": {";
		str += "						\"time\": 29700,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.969,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"1\": {";
		str += "						\"time\": 25200,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.363,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"0\": {";
		str += "						\"touched_by\": 1,";
		str += "						\"time\": 0,";
		str += "						\"touched_tzo\": -21600,";
		str += "						\"entry_type\": \"continuation\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\",";
		str += "						\"touched_at\": 1341988357";
		str += "					},";
		str += "					\"4\": {";
		str += "						\"time\": 78300,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\"";
		str += "					}";
		str += "				},";
		str += "				\"0\": {";
		str += "					\"3\": {";
		str += "						\"time\": 64800,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.196,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"2\": {";
		str += "						\"time\": 29700,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.969,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"1\": {";
		str += "						\"time\": 25200,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.363,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"0\": {";
		str += "						\"touched_by\": 1,";
		str += "						\"time\": 0,";
		str += "						\"touched_tzo\": -21600,";
		str += "						\"entry_type\": \"continuation\",";
		str += "						\"temp\": 12.822,";
		str += "						\"type\": \"HEAT\",";
		str += "						\"touched_at\": 1341988357";
		str += "					},";
		str += "					\"4\": {";
		str += "						\"time\": 78300,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\"";
		str += "					}";
		str += "				},";
		str += "				\"6\": {";
		str += "					\"2\": {";
		str += "						\"time\": 81900,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.822,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"1\": {";
		str += "						\"time\": 27000,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.44,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"0\": {";
		str += "						\"touched_by\": 1,";
		str += "						\"time\": 0,";
		str += "						\"touched_tzo\": -21600,";
		str += "						\"entry_type\": \"continuation\",";
		str += "						\"temp\": 12.822,";
		str += "						\"type\": \"HEAT\",";
		str += "						\"touched_at\": 1341988357";
		str += "					}";
		str += "				},";
		str += "				\"5\": {";
		str += "					\"2\": {";
		str += "						\"time\": 81900,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.822,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"1\": {";
		str += "						\"time\": 27000,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.44,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"0\": {";
		str += "						\"touched_by\": 1,";
		str += "						\"time\": 0,";
		str += "						\"touched_tzo\": -21600,";
		str += "						\"entry_type\": \"continuation\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\",";
		str += "						\"touched_at\": 1341988357";
		str += "					}";
		str += "				},";
		str += "				\"4\": {";
		str += "					\"3\": {";
		str += "						\"time\": 64800,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.196,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"2\": {";
		str += "						\"time\": 29700,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.969,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"1\": {";
		str += "						\"time\": 25200,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 18.363,";
		str += "						\"type\": \"HEAT\"";
		str += "					},";
		str += "					\"0\": {";
		str += "						\"touched_by\": 1,";
		str += "						\"time\": 0,";
		str += "						\"touched_tzo\": -21600,";
		str += "						\"entry_type\": \"continuation\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\",";
		str += "						\"touched_at\": 1341988357";
		str += "					},";
		str += "					\"4\": {";
		str += "						\"time\": 78300,";
		str += "						\"entry_type\": \"setpoint\",";
		str += "						\"temp\": 12.841,";
		str += "						\"type\": \"HEAT\"";
		str += "					}";
		str += "				}";
		str += "			},";
		str += "			\"schedule_mode\": \"HEAT\",";
		str += "			\"name\": \"Nest Current Schedule\",";
		str += "			\"ver\": 2";
		str += "		}";
		str += "	},";
		str += "	\"shared\": {";
		str += "		\"01AA01AB411101F1\": {";
		str += "			\"$version\": -1896619651,";
		str += "			\"$timestamp\": 1342051221000,";
		str += "			\"auto_away\": 0,";
		str += "			\"auto_away_learning\": \"ready\",";
		str += "			\"compressor_lockout_enabled\": false,";
		str += "			\"target_temperature_type\": \"off\",";
		str += "			\"hvac_heater_state\": false,";
		str += "			\"can_heat\": true,";
		str += "			\"compressor_lockout_timeout\": 0,";
		str += "			\"target_temperature_high\": 26.66663,";
		str += "			\"hvac_aux_heater_state\": false,";
		str += "			\"hvac_heat_x2_state\": false,";
		str += "			\"target_temperature_low\": 16.66663,";
		str += "			\"target_temperature\": 18.196,";
		str += "			\"hvac_ac_state\": false,";
		str += "			\"hvac_fan_state\": false,";
		str += "			\"target_change_pending\": false,";
		str += "			\"name\": \"Nest\",";
		str += "			\"current_temperature\": 22.06,";
		str += "			\"can_cool\": false";
		str += "		}";
		str += "	},";
		str += "	\"user_alert_dialog\": {";
		str += "		\"5005\": {";
		str += "			\"$version\": -141125587,";
		str += "			\"$timestamp\": 1323898927000,";
		str += "			\"dialog_id\": \"confirm-pairing\",";
		str += "			\"dialog_data\": \"\"";
		str += "		}";
		str += "	},";
		str += "	\"user\": {";
		str += "		\"5005\": {";
		str += "			\"$version\": 1138848506,";
		str += "			\"$timestamp\": 1322945722000,";
		str += "			\"name\": \"chad.corbin@gmail.com\",";
		str += "			\"structures\": [";
		str += "				\"structure.df6b6720-1df0-11e1-8900-1231381520b0\"";
		str += "			]";
		str += "		}";
		str += "	}";
		str += "}";
		return str;
	}
}
